/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.offline2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
class CR implements Message {

    List<Student> studentList = new ArrayList<Student>();
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyStudents();
    }

    @Override
    public void register(Student s) {
        studentList.add(s);
    }

    @Override
    public void unregister(Student s) {
        studentList.remove(s);
    }

    @Override
    public void notifyStudents() {
        boolean b=false;
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Sending message to student "+(i+1));
            b=studentList.get(i).update(msg);
            if(b==true)
            {
                System.out.println("message sent");
            }
            else
            {
                System.out.println("send failed");
            }
        }
    }
}