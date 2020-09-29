#!/bin/bash
file=text.txt
# To check existence of the file
[ -e $file ] && E="The file exists" || E="The file does NOT exists"
echo "$E"
[ -w $file ] && F="The file is already Writable" || F="The file is now Writable"
chmod u+w $file 
echo "$F"
