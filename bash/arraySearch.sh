echo -n "Enter array size: "
read n
index_array=()
for (( i=0; i<n; i++))
do
	echo -n "[$i]: "
	read index_array[i]
done
echo -n "Enter element to search: "
read var
for (( i=0; i<n; i++))
do
	if [ ${index_array[$i]} == $var ]
	then
		echo "$var found at $(( i+1 ))"
		break
	fi
done
