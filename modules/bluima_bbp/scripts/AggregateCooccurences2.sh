#!/bin/sh

mvn clean install exec:java \
-Dexec.mainClass="ch.epfl.bbp.uima.projects.brainregions.AggregateCooccurences2" \
-Dexec.classpathScope=runtime \
-Dblue_uima_home=../../.
