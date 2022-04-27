"use strict";
var croom1 = new Map();
var croom2 = new Map();
croom1.set("user1", ["Hi user1", "How are you?", "I am fine", "Thank you"]);
croom1.set("user2", ["Hi user2", "How are you?", "I am fine", "Thank you"]);
croom1.set("user3", ["Hi user3", "How are you?", "I am fine", "Thank you"]);
croom2.set("user4", ["Hello user4", "How are you?", "I am fine", "Thank you"]);
croom2.set("user5", ["Hello user5", "How are you?", "I am fine", "Thank you"]);
croom2.set("user6", ["Hello user6", "How are you?", "I am fine", "Thank you"]);
var printusers = (room, name) => {
    document.write(`Users in room name ${name} are : ` + "<br>");
    for (let key of room.keys()) {
        document.write(key + "<br>");
    }
};
var printmessages = (room, name) => {
    document.write(`<br>Messages in room name ${name} are : ` + "<br>");
    for (let value of room.values()) {
        document.write(value + "<br>");
    }
};
printusers(croom1, "chatroom1");
printusers(croom2, "chatroom2");
printmessages(croom1, "chatroom1");
printmessages(croom2, "chatroom2");
//# sourceMappingURL=q4.js.map