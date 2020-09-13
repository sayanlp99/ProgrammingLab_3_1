echo -n "Enter first number:"
read n
echo -n "Enter second number:"
read m
echo -n "Enter third number:"
read o
if [[ $n -ge $m ]]
then
  if [[ $n -ge $o ]]
  then
    echo "$n is the largest number."
  else
    echo "$o is the largest number."
  fi
else
  if [[ $m -ge $o ]]
  then
    echo "$m is the largest number."
  else
    echo "$o is the largest number."
  fi
fi