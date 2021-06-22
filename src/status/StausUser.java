/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm Exam
 *
 * @author srinivsi
 */
public class StausUser
{
   public void statusDetail (int code)
   {
      switch (code) {
         case 0:
            System.out.println(Statuses.REJECTED);
            break;
         case 1:
            System.out.println(Statuses.PENDING);
            break;
         case 2:
            System.out.println(Statuses.PROCESSING);
            break;
         case 3:
            System.out.println(Statuses.APPROVED);
            break;
         default:
            System.out.println("NOT VALID CODE");
            break;
      }
   }

}
