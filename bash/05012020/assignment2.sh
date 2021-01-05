#!/bin/bash
FILE=”/home/sayan/pass.txt”
if [ -e “$FILE” ]
  then
     echo “$FILE passwords are enabled”
fi
if [ -x “$FILE” ]
  then
    echo “You have permition to edit $FILE”
  else
    echo “You do Not have permissions to edit $FILE”
fi
