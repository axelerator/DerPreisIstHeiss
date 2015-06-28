#!/bin/bash

echo '```java' > README.md
cat DerPreisIstHeiss.java >> README.md
echo '```' >> README.md
javac DerPreisIstHeiss.java 2> errors

if [[ $? == 0 ]]; then
  echo -e "Ausgabe:" >> README.md
  echo -e "========" >> README.md
  echo '```' >> README.md
  java DerPreisIstHeiss > result 2> errors
  if [[ $? == 0 ]]; then
    cat result >> README.md
  else
    cat errors >> README.md
  fi
  echo '```' >> README.md
else
  echo 'Kompilierfehler:' >> README.md
  echo '================' >> README.md
  echo '```' >> README.md
  cat errors >> README.md
  echo '```' >> README.md
fi 
cat README.md

