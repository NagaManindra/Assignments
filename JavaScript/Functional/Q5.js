<<<<<<< HEAD
function isEven(num){
    if(num%2==0){
        return true;
    }
    else
        return false;
}
var arr=[1,3,5,4,2];
function find(arr,func){
    for(var i=0;i,arr.length;i++){
        if(func(arr[i])==true)
            return arr[i];
        else{
            arr.shift();
            return(find(arr,func));
        }
    }

}
=======
function isEven(num){
    if(num%2==0){
        return true;
    }
    else
        return false;
}
var arr=[1,3,5,4,2];
function find(arr,func){
    for(var i=0;i,arr.length;i++){
        if(func(arr[i])==true)
            return arr[i];
        else{
            arr.shift();
            return(find(arr,func));
        }
    }

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
document.write(find(arr,isEven));