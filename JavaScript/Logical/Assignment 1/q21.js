<<<<<<< HEAD
function mergeArrays(arr1,  arr2 , n1 , n2,  arr3) {
        var i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n1)
            arr3[k++] = arr1[i++];
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
 
     
        var arr1 = [ 1, 2, 3 ];
        var n1 = arr1.length;
 
        var arr2 = [ 4, 5, 6 ];
        var n2 = arr2.length;
 
        var arr3 = Array(n1 + n2).fill(0);
 
        mergeArrays(arr1, arr2, n1, n2, arr3);
 
        document.write("Array after merging<br/>");
        for (i = 0; i < n1 + n2; i++)
=======
function mergeArrays(arr1,  arr2 , n1 , n2,  arr3) {
        var i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < n1)
            arr3[k++] = arr1[i++];
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
 
     
        var arr1 = [ 1, 2, 3 ];
        var n1 = arr1.length;
 
        var arr2 = [ 4, 5, 6 ];
        var n2 = arr2.length;
 
        var arr3 = Array(n1 + n2).fill(0);
 
        mergeArrays(arr1, arr2, n1, n2, arr3);
 
        document.write("Array after merging<br/>");
        for (i = 0; i < n1 + n2; i++)
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
            document.write(arr3[i] + " ");