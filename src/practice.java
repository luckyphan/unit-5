public class practice {

        String person;
        practice next;

        public practice(String person, practice next){
            this.person = person;
            this.next = next;
        }

        public void setNext(practice node){
            this.next = node;
        }
        public String toString(){
            String result ="";
            practice temp = this;
            while(temp != null){
                result += " [" + temp.person + "]";
                temp = temp.next;
            }
            return result;
        }
}
