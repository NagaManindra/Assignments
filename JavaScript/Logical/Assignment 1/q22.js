<<<<<<< HEAD
var a = [1,2,3,4,5,6];
var count = 0;
var num = parseInt(prompt("Enter number:"));
a.reverse();
for(var i = 1;i <= num ;i++){
    a.unshift(a.pop());
    count++;
}
=======
var a = [1,2,3,4,5,6];
var count = 0;
var num = parseInt(prompt("Enter number:"));
a.reverse();
for(var i = 1;i <= num ;i++){
    a.unshift(a.pop());
    count++;
}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
document.write("Shifted array "+a.reverse()+"<br>No of Shifts are "+count);