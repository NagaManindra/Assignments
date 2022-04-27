<<<<<<< HEAD
function forSum(array){
    var sum=0;
    for (var i in array){
        sum += array[i];
    }
    return sum;
}
function whileSum(array){
    var sum1=0;
    var i=0;
    while(i < array.length){
        sum1 += array[i];
        i++;
    }
    return sum1;
}
function findSum(A, N) {
    if (N <= 0)
        return 0;
    return (findSum(A, N - 1) + A[N - 1]);
}
 
var A = [1, 2, 3, 4, 5];
var N = A.length;

document.write(forSum(A)+"<br>");
document.write(whileSum(A)+"<br>");
=======
function forSum(array){
    var sum=0;
    for (var i in array){
        sum += array[i];
    }
    return sum;
}
function whileSum(array){
    var sum1=0;
    var i=0;
    while(i < array.length){
        sum1 += array[i];
        i++;
    }
    return sum1;
}
function findSum(A, N) {
    if (N <= 0)
        return 0;
    return (findSum(A, N - 1) + A[N - 1]);
}
 
var A = [1, 2, 3, 4, 5];
var N = A.length;

document.write(forSum(A)+"<br>");
document.write(whileSum(A)+"<br>");
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
document.write(findSum(A, N));