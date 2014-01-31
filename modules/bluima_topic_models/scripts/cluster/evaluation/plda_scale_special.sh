#!/bin/bash -l
#SBATCH --job-name="PLDA Scale"
#SBATCH --nodes=1
#SBATCH --ntasks=1
#SBATCH --ntasks-per-node=1
#SBATCH --mem=5000
#SBATCH --time=23:30:00
#SBATCH --partition=batch
#SBATCH --mail-type=ALL
#SBATCH --mail-user=marc.zimmermann@epfl.ch
#SBATCH --output=/nfs4/bbp.epfl.ch/user/mazimmer/slurm-plda-scale-stdout.log
#SBATCH --error=/nfs4/bbp.epfl.ch/user/mazimmer/slurm-plda-scale-stderr.log
 
# In case there are per-group custom initialization files
#. /nfs4/bbp.epfl.ch/group/visualization/module/modules.bash
# Load your required module files here
#module load MODULE_TO_BE_LOADED
 
# To avoid Kerberos tickets becoming expired, run the following in
# the background to check every 30min and try to renew it
krenew -b -K 30
 
echo "On which node your job has been scheduled :"
echo $SLURM_JOB_NODELIST
echo "Print current shell limits :"
ulimit -a

LDA="$HOME/private/plda/lda"

corpus_root="$HOME/private/corpora/pubmed"
topics=100
logfile="$HOME/private/logs/plda_eval_$(basename $corpus_root)_noopt_scale.log"

# Griffiths and Steyvers proposal
alpha=$(echo "scale=4;50/$topics" | bc)
beta=0.01

iterations=80

working_dir="$corpus_root/plda"
folds=10 # number of folds

cd $working_dir

startt=$(date "+%s")
\time -o plda.usage -a -f "%e %D %K %M" $LDA --num_topics $topics --alpha $alpha --beta $beta \
             --training_data_file plda_train0 \
             --model_file lda_model.txt \
             --total_iterations $iterations --burn_in_iterations 70 >> $logfile
endt=$(date "+%s")
t=$(echo "$endt - $startt" | bc)
echo "1 $t" >> $logfile
