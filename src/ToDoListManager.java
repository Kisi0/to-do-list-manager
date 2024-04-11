import java.util.Scanner;

public class ToDoListManager {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the limit of the lists you want to have ");
        int limit = scanner.nextInt();
        ToDoList[] Lists = new ToDoList[limit];
        int listsCount = 0;
        while(true){
            System.out.println("TO DO LIST MANAGER");
            System.out.println("1. Create to do list");
            System.out.println("2. View exiting to do list");
            System.out.println("3. Exit");
            System.out.println("Please enter your choice ");
            int choice= scanner.nextInt();
            scanner.nextLine();
            if (choice==1){
                if(listsCount< Lists.length) {
                    System.out.println("Please eneter the list name : ");
                    String name=scanner.nextLine();
                    Lists[listsCount] = new ToDoList(name,10);
                    listsCount++;
                    System.out.println("The list: " + name + " created. ");
                }
                else{
                    System.out.println("You have reached the limit");
                }
            } else if (choice==2) {
                System.out.println("This is the TO DO LISTS available");
                for (int i=9; i<listsCount; i++){
                    System.out.println( (i+1)+" "+Lists[i].name);
                }
                System.out.println("Please enter the index of the list you want to work with");
                int listIndex= scanner.nextInt();
                ToDoList listchosen= Lists[listIndex-1];
                while(true){
                    System.out.println("Chose: ");
                    System.out.println("1. Add a task ");
                    System.out.println("2. Remove a task");
                    System.out.println("3. Set a completed task");
                    System.out.println("4. List the task ");
                    System.out.println("5. Return");
                    System.out.println("Please enter your secound choice ");
                    int choice2 = scanner.nextInt();
                    switch (choice2){
                        case 1:
                            scanner.nextLine();
                            System.out.println("Please enter the name of the task");
                            String name= scanner.nextLine();
                            System.out.println("Put the description: ");
                            String description= scanner.nextLine();
                            System.out.println("Put the date: ");
                            String date= scanner.nextLine();
                            System.out.println("Put the priority level: ");
                            String priority_level= scanner.nextLine();
                            Task task= new Task(name , description, date, priority_level);
                            listchosen.addTask(task);
                            System.out.println("Tasks added succesfully");
                            break;
                        case 2:
                            System.out.println("PLease enter the index you want to remove ");
                            int indexRemove = scanner.nextInt();
                            if(listIndex==indexRemove) {
                                listchosen.removeTask(listIndex - 1);
                            }
                            break;
                        case 3:
                            listchosen.displayTask();
                            System.out.println("Please enter the index you want to modify");
                            int indexModify = scanner.nextInt();
                            Task task2 = listchosen.getTask(indexModify - 1);
                            if (task2 != null) {
                                task2.setComplited();
                                System.out.println("The process is done successfully");
                            } else {
                                System.out.println("You have put a wrong index");
                            }
                            break;
                        case 4:
                            listchosen.displayTask();
                        case 5:
                            break;



                    }
                }
            }

        }

    }
}
