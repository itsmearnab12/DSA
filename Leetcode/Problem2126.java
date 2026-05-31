class Problem2126 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currentMass = mass;
        for(int i = 0; i < asteroids.length; i++){
            if(currentMass < asteroids[i]){
                return false;
                
            }
            currentMass += asteroids[i];
        }
        return true;
    }
}