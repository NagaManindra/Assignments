<<<<<<< HEAD
var num = prompt("Q6:Enter Number:");
var operation = prompt("Enter A if you want to get Sum or Enter B if you want Product")
var r = 0;
if(operation=="A"){
    for(i=1;i<=num;i++){
        r=r+i;
    }
document.write("Sum of number till "+num+"="+r); 
}
else if(operation=="B"){
    r=1;
    for(i=1;i<=num;i++){
        r=r*i;
    }
document.write("Sum of number till "+num+"="+r); 
}
else{
    document.write("Wrong input");
}
=======
var num = prompt("Q6:Enter Number:");
var operation = prompt("Enter A if you want to get Sum or Enter B if you want Product")
var r = 0;
if(operation=="A"){
    for(i=1;i<=num;i++){
        r=r+i;
    }
document.write("Sum of number till "+num+"="+r); 
}
else if(operation=="B"){
    r=1;
    for(i=1;i<=num;i++){
        r=r*i;
    }
document.write("Sum of number till "+num+"="+r); 
}
else{
    document.write("Wrong input");
}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
