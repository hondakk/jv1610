/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTypes;

//import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Ksenia
 */
public class App3 {
    public static void main(String[] args) {

        String []  a = {
            "Дорогие друзья!",
            "с другой стороны",
            "равным образом ",
            "Не следует, однако, забывать о том, что ",
            "Таким образом, ",
            "Повседневная практика показывает",
            "Значимость этих проблем настолько очевидна, что",
            "Разнообразный и богатый опыт ",
            "Задача организации, в особенности же ",
            "Соображения высшего порядка, а также ",
        };

        String []  a1 = {
            "реализация намеченных плановых заданий ",
            "рамки и место обучения кадров",
            "постоянный количественный рост и сфера нашей активности сложившаяся структура организации",
            "новая модель  ",
            "организационной деятельности  ",
            "дальнейшее развитие различных форм деятельности ",
            "постоянное информационно-пропагандистское обеспечение нашей деятельности",
            "укрепления и развития структуры ",
            "консультация с широким активом",
            "начало повседневной работы по формированию позиции ",
        };

        String []  a2 = {
            "играет важную роль в формировании ",
            "требуют от нас анализа ",
            "требуют определения и уточнения",
            "способствует подготовке и реализации  ",
            "обеспечивает широкому кругу специалистов участие в формировании  ",
            "позволяет выполнить ",
            "важнейшие задания по разработке ",
            "в значительной степени обуславливает создание ",
            "позволяет оценить значение",
            "представляет собой интересный эксперимент проверки ",
            
        };

        String []  a3 = {
            "существующих финансовых и административных условий ",
            "дальнейших направлений развитая ",
            "системы массового участия" ,
            "позиций, занимаемых участниками в отношении поставленных задач  ",
            "новых предложений ",
            "направлений прогрессивного развития",
            "системы обучения кадров соответствующей насущным потребностям" ,
            "соответствующих условий активизации",
            "модели развития",
            "форм воздействия",
        };
        String b= " ";
                                                                              
     for(int i = 0; i < 11; i++){
           b+=a[ (new Random ().nextInt (a.length))];
           b+=a1[(new Random().nextInt(a1.length))];
           b+=a2[(new Random().nextInt(a2.length))];
           b+=a3[(new Random().nextInt(a3.length))];
           
        
        
           
     }
            System.out.println(b);
           

      
         System.out.println(" ");
         
       
    }

}