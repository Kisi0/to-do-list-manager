public class Task {

    String name;
    String description;
    String date;
    String priority_level;
    boolean isComplited;

    public Task(){}
    public Task (String name, String description,String date ,String priority_level){
     this.name=name;
     this.description=description;
     this.date= date;
     this.priority_level= priority_level;
     this.isComplited=false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getPriority_level() {
        return priority_level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPriority_level(String priority_level) {
        this.priority_level = priority_level;
    }

    public void setComplited() {
        isComplited = true;
    }

    public boolean isComplited() {
        return isComplited;


    }


    public void display(){
        System.out.println("Name: " +name +"\nDescription: " + description+"\nDate: " +date +"\nPriority: " + priority_level);
        if(isComplited) {
            System.out.println("Is complited : Yes ");
        }
            else{
                System.out.println("is complited : No ");
            }

    }
}
