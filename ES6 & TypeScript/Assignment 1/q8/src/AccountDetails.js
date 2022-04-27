<<<<<<< HEAD
import { SavingAccount } from './SavingAccount.js';
import { CurrentAccount } from './CurrentAccount.js';

var SavingAccountObj = new SavingAccount(123,"Naga",10000,11);
document.write(SavingAccountObj.getBalance()+"<br>");

var CurrentAccountObj = new CurrentAccount(124,"Manindra",10000,100);
=======
import { SavingAccount } from './SavingAccount.js';
import { CurrentAccount } from './CurrentAccount.js';

var SavingAccountObj = new SavingAccount(123,"Naga",10000,11);
document.write(SavingAccountObj.getBalance()+"<br>");

var CurrentAccountObj = new CurrentAccount(124,"Manindra",10000,100);
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
document.write(CurrentAccountObj.getBalance());