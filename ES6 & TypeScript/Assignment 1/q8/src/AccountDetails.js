import { SavingAccount } from './SavingAccount.js';
import { CurrentAccount } from './CurrentAccount.js';

var SavingAccountObj = new SavingAccount(123,"Naga",10000,11);
document.write(SavingAccountObj.getBalance()+"<br>");

var CurrentAccountObj = new CurrentAccount(124,"Manindra",10000,100);
document.write(CurrentAccountObj.getBalance());