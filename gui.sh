#!/usr/bin/env bash

source ./compile.sh
cd out
cat ../src/test/resources/$1_*.txt | java org.antlr.v4.gui.TestRig Bitflow script -tokens
cat ../src/test/resources/$1_*_.txt | java org.antlr.v4.gui.TestRig Bitflow script -gui
cd ..