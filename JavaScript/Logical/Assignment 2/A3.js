<<<<<<< HEAD
function createTable()
{
rn = window.prompt("Input number of rows", 1);
cn = window.prompt("Input number of columns",1);
  
 for(var r=0;r<parseInt(rn);r++)
  {
   var x=document.getElementById('myTable').insertRow(r);
   for(var c=0;c<parseInt(cn);c++)  
    {
     var y=  x.insertCell(c);
     y.innerHTML="("+r+","+c+")"; 
    }
   }
=======
function createTable()
{
rn = window.prompt("Input number of rows", 1);
cn = window.prompt("Input number of columns",1);
  
 for(var r=0;r<parseInt(rn);r++)
  {
   var x=document.getElementById('myTable').insertRow(r);
   for(var c=0;c<parseInt(cn);c++)  
    {
     var y=  x.insertCell(c);
     y.innerHTML="("+r+","+c+")"; 
    }
   }
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
}