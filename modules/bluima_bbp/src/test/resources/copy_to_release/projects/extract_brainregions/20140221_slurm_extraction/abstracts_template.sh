#!/bin/bash -l
#SBATCH --job-name="%(job_id)s%(ner)s"
#SBATCH --nodes=1
#SBATCH --ntasks=3
#SBATCH --ntasks-per-node=3
#SBATCH --mem=4192
#SBATCH --time=6:30:00
#SBATCH --partition=batch
#SBATCH --mail-type=ALL
#SBATCH --mail-user=renaud.richardet@gmail.com
#SBATCH --output=/nfs4/bbp.epfl.ch/user/richarde/slurm_logs/20140221/%(ner)s%(job_id)s-stdout.log
#SBATCH --error=/nfs4/bbp.epfl.ch/user/richarde/slurm_logs/20140221/%(ner)s%(job_id)s-stdout.log

krenew -b -K 30
export LANG=en_US.UTF-8

echo "%(job_id)s -- %(ner)s: started with %(from_id)s %(to_id)s"

cd /nfs4/bbp.epfl.ch/user/richarde/dev/bluebrain/bluima_20140221

./bin/run_pipeline pipelines/projects/extract_brainregions/extract_brainregions/20140221_slurm_extraction/abstracts.pipeline \
%(job_id)s %(ner)s \
/nfs4/bbp.epfl.ch/simulation/nlp/data/20140221_br_rels %(from_id)s %(to_id)s /
