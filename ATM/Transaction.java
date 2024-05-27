import java.util.Date;
    public class Transaction {
        private final double amount;
        private final  String type; // "Withdrawal", "Deposit", "Transfer"
        private final  Date date; // Use java.util.Date or other date/time library
    
        public Transaction(double amount, String type, Date date) {
            this.amount = amount;
            this.type = type;
            this.date = date;
        }
    
        public double getAmount() {
            return amount;
        }
    
        public String getType() {
            return type;
        }
    
        public Date getDate() {
            return date;
        }
    }
    
    

