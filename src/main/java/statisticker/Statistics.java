package statisticker;

import java.util.List;

public class Statistics 
{
    public static class Stats {
        public float min, max;
        public float average;
        public Stats(){
            min=Float.NaN;
            max =Float.NaN;
            average=Float.NaN;
        }
        public Stats(float average, float min, float max){
            this.average= average;
            this.max=max;
            this.min=min;
        }
    }

    public static Stats getStatistics(List<Float> numbers) {
        if(numbers.isEmpty())
            return new Stats();
        float min, max;
        float avg=0;
        min = numbers.get(0);
        max= min;
        for(float f:numbers){
            if(min>f)
                min=f;
            if(max<f)
                max=f;
            avg=avg+f;
        }
        avg=avg/numbers.size();
        Statistics.Stats s=new Statistics.Stats(avg,min,max);
        return s;
    }
}
