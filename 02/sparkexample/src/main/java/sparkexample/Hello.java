package sparkexample;

import static spark.Spark.get;

public class Hello {

    public static void main(String[] args) {
        get("/", (req, res) -> {
            return "Hello! I use Maven to run spark app on Docker. That's great!";
        });
    }
}
