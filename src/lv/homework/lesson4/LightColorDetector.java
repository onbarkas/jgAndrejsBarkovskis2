package lv.homework.lesson4;

public class LightColorDetector {
    public String detect(int wavelenght){ //camelCase!!

        //šeit labak izmantot "if-elseif-else" jo var iestāties tiek viens no noteiktajiem stāvokļiem
        if ((wavelenght >= 380) && (wavelenght < 450)){ //nav nepieciešams tik daudz iekavu
//            if (wavelenght >= 380 && wavelenght < 450){ //ir tas pats
            return "Violeta";
        }
        if ((wavelenght >= 450) && (wavelenght < 495)){
            return "Zila";
        }
        if ((wavelenght >= 495) && (wavelenght < 570)){
            return "Zalja";
        }
        if ((wavelenght >= 570) && (wavelenght < 590)){
            return "Dzeltena";
        }
        if ((wavelenght >= 590) && (wavelenght < 620)){
            return "Oranza";
        }
        if ((wavelenght >= 620) && (wavelenght < 750)){
            return "Sarkana";
        }
        return "Gaisma nav redzama";
    }
}
