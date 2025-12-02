public class Main {
    public static void main(String[] args) {

        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Cayon", "36.1085, -112.0965"),
                new Park("Ramiro", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Missisipi", "47.0394, -95.0293", "44.2934, -97.1234", "45.3234, -93.1236"),
                new River("Missouri", "34.5989, -81.5064", "32.1034, -79.1230", "35.2094, -76.1532")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);

        riverLayer.addElements(
                new River("Rio itajai", "23.5940, 64.3945", "20.9584, 62.3450", "20.7492, 60.4823"),
                new River("Rio niterói", "16.9434, 87.4953", "13.8595, 85.3948", "11.9475, 85.3904")
        );

        riverLayer.renderLayer();
    }
}