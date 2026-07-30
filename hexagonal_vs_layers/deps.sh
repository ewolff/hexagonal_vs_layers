#!/bin/sh
jdeps -verbose:class --dot-output deps bin
dot -Tsvg deps/bin.dot -o deps.svg
