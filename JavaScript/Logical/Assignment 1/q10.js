<<<<<<< HEAD
var year = parseInt(prompt("Enter Year"));
for(var i = 0; i <= 20 ; i++){
    
    if ((0 == year % 4) && (0 != year % 100) || (0 == year % 400)) {
        document.write(year + ' is a leap year <br>');
    } else {
        document.write(year + ' is not a leap year<br>');
    }
    year += 1;
=======
var year = parseInt(prompt("Enter Year"));
for(var i = 0; i <= 20 ; i++){
    
    if ((0 == year % 4) && (0 != year % 100) || (0 == year % 400)) {
        document.write(year + ' is a leap year <br>');
    } else {
        document.write(year + ' is not a leap year<br>');
    }
    year += 1;
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
}