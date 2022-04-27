var num = Math.floor(Math.random()*6)+1;
numRollsToGetSix=()=>{
    document.write(`The Number is ${num} <br> Number of times you need to roll to get 6 is ${6-num}`)
}
numRollsToGetSix();