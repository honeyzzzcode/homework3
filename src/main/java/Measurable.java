interface Measurable {
    double getMeasure();
    static Measurable largest(Measurable[] objects)
    {
        if (objects.length == 0)
        {
            return null;
        }
        Measurable max = objects[0];
        for (Measurable obj : objects)
        {
            if (obj.getMeasure() > max.getMeasure())
            {
                max = obj;
            }
        }
        return max;
    }}