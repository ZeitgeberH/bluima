# script to generate config files for Slurm on viz-cluster, using a template

def template(template_file, out_file,vars):
  out_f = file(out_file, 'w')
  out_f.write(open(template_file, 'r').read() % vars)
  out_f.close()

# max 24 511 642

for i in range(0,491):
  output_name = 'abstracts_output_templates/bams_slurm%i.sh' % i
  print 'sbatch %s' % output_name
  template('abstracts_template.sh', output_name, {
    'job_id': '%i' % i,
    'ner': 'bams',
    'from_id' : (i * 50000),
    'to_id'   : (i * 50000 + 49999)
  })


for i in range(0,491):
  output_name = 'abstracts_output_templates/aba_slurm%i.sh' % i
  print 'sbatch %s' % output_name
  template('abstracts_template.sh', output_name, {
    'job_id': '%i' % i,
    'ner': 'aba',
    'from_id' : (i * 50000),
    'to_id'   : (i * 50000 + 49999)
  })
