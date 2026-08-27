public class ShipmentFactory {
    
    public Shipment createShipment(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Type must not be null or empty");
        }
        
        return switch (type.toUpperCase()) {
            case "STANDARD" -> new StandardShipment();
            case "EXPRESS" -> new ExpressShipment();
            default -> throw new IllegalArgumentException("Unknown shipment type: " + type);
        };
    }
}
