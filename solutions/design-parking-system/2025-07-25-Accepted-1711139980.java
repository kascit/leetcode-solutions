/*
 * Submission: 1711139980
 * Problem: Design Parking System (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 15:15:49 UTC
 * Runtime: 8 ms
 * Memory: 45.2 MB
 */

class ParkingSystem {
    int b, m, s;
    public ParkingSystem(int big, int medium, int small) {
        b = big; m = medium; s = small;
    }
    
    public boolean addCar(int carType) {
        return switch (carType) {
            case 1 -> ( (b = b - 1) > -1 );
            case 2 -> ( (m = m - 1) > -1 );
            case 3 -> ( (s = s - 1) > -1 );
            default -> false;
        };
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */