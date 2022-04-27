"use strict";
const listArmStrong = [0, 1, 153, 370, 371, 407];
const iterator = listArmStrong[Symbol.iterator]();
function getNextArmstrong() {
    return iterator.next().value;
}
document.write(getNextArmstrong() + "<br>");
document.write(getNextArmstrong() + "<br>");
document.write(getNextArmstrong() + "<br>");
document.write(getNextArmstrong() + "<br>");
//# sourceMappingURL=q2.js.map