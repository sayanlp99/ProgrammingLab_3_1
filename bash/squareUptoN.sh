echo "Enter the number:"
read n
for((i=1;i<=n;i++))
do
s=`expr $i \* $i`
echo $s
done
