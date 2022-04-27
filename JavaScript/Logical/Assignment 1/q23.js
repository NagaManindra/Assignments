<<<<<<< HEAD
const number = parseInt(prompt('Enter the number of terms: '));
let n1 = 1, n2 = 1, nextTerm;

document.write('Fibonacci Series:<br>');
function myFunction(number){
    for (let i = 1; i <= number; i++) {
    document.write(n1+"<br>");
    nextTerm = n1 + n2;
    n1 = n2;
    n2 = nextTerm;
}
}
=======
const number = parseInt(prompt('Enter the number of terms: '));
let n1 = 1, n2 = 1, nextTerm;

document.write('Fibonacci Series:<br>');
function myFunction(number){
    for (let i = 1; i <= number; i++) {
    document.write(n1+"<br>");
    nextTerm = n1 + n2;
    n1 = n2;
    n2 = nextTerm;
}
}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
myFunction(number);