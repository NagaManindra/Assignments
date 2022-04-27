<<<<<<< HEAD
function coinFlip() {
    return(Math.random() < 0.3) ? 'Heads' : 'Tails'; 
}

var howManyTimes=500;
var countHeads=0; 
for (var i=0; i<howManyTimes;i++){
if (coinFlip()==='Heads'){
 countHeads++;
}
}
=======
function coinFlip() {
    return(Math.random() < 0.3) ? 'Heads' : 'Tails'; 
}

var howManyTimes=500;
var countHeads=0; 
for (var i=0; i<howManyTimes;i++){
if (coinFlip()==='Heads'){
 countHeads++;
}
}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
document.write("Heads appear "+(countHeads/howManyTimes)*100+"% of the time");