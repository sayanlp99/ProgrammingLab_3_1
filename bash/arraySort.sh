echo -n "Enter array size: "
read n
array=()
for (( i=0; i<n; i++))
do
        echo -n "[$i]: "
        read array[i]
done
echo "Sorted Elements:"
IFS=$'\n' sorted=($(sort <<<"${array[*]}")); unset IFS
printf "[%s]  " "${sorted[@]}"
echo ""
