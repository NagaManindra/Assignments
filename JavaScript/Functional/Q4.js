<<<<<<< HEAD
var arr=[1,2,3,4,5];
var arr1 = [1,4,9,16,25];
function square(x){
    return x*x;
}
function map(arr,func){
    for(var i=0;i<arr.length;i++){
        arr[i]=func(arr[i]);
    }
    return arr;
}
document.write(map(arr,square)+"<br>");
=======
var arr=[1,2,3,4,5];
var arr1 = [1,4,9,16,25];
function square(x){
    return x*x;
}
function map(arr,func){
    for(var i=0;i<arr.length;i++){
        arr[i]=func(arr[i]);
    }
    return arr;
}
document.write(map(arr,square)+"<br>");
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
document.write(map(arr1,Math.sqrt));