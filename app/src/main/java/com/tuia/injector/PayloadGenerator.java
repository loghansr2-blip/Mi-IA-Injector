public class PayloadGenerator {
    public static String generate(String rawPayload, String remoteHost, int remotePort) {
        // Reemplaza las etiquetas estándar que usan apps como HTTP Injector
        String formatted = rawPayload
            .replace("[host_port]", remoteHost + ":" + remotePort)
            .replace("[host]", remoteHost)
            .replace("[protocol]", "HTTP/1.1")
            .replace("[crlf]", "\r\n")
            .replace("[lf]", "\n");
        
        return formatted;
    }
}
