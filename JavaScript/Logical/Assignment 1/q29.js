<<<<<<< HEAD
var x = "hello\nworld\nin\na\nframe";

function star(str) {
  var arr = [];
  arr = str.split("\n");
  for (let index = 0; index < 1; index++) {
    
    for (let j = 0; j <= arr.length; j++) {
     arr == arr[j].split(",");
     document.write("*" + arr[j] + "*" +"<br>");
    }
  }
  
  return arr;
}
document.write("*******<br>");
document.write(star(x)+"<br>");
=======
var x = "hello\nworld\nin\na\nframe";

function star(str) {
  var arr = [];
  arr = str.split("\n");
  for (let index = 0; index < 1; index++) {
    
    for (let j = 0; j <= arr.length; j++) {
     arr == arr[j].split(",");
     document.write("*" + arr[j] + "*" +"<br>");
    }
  }
  
  return arr;
}
document.write("*******<br>");
document.write(star(x)+"<br>");
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
document.write("*******");