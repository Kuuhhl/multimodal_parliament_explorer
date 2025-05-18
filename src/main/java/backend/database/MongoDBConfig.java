package backend.database;

/**
 * @author: Philipp Landmann, Philipp Noah Hein
 * <p>
 * Liest environment-Variablen und stellt Methoden bereit,
 * um Verbindungsdetails für MongoDB abzurufen.
 * <p>
 * Erwartete Umgebungsvariablen:
 * <ul>
 *   <li>REMOTE_HOST</li>
 *   <li>REMOTE_DATABASE</li>
 *   <li>REMOTE_USER</li>
 *   <li>REMOTE_PASSWORD</li>
 *   <li>REMOTE_PORT</li>
 * </ul>
 */
public class MongoDBConfig {

    public MongoDBConfig() {
        // check if all environment variables have a value
        String[] requiredVars = {"REMOTE_DATABASE", "REMOTE_HOST", "REMOTE_USER", "REMOTE_PASSWORD", "REMOTE_PORT", "REMOTE_PROTOCOL"};
        for (String var : requiredVars) {
            if (System.getenv(var) == null) {
                System.err.println("Fehler: Die Umgebungsvariable " + var + " ist nicht gesetzt.");
                System.exit(1);
            }
        }
    }

    /**
     * @return URI String im Format:
     * "mongodb://benutzer:passwort@host:port/?authSource=datenbank&authMechanism=SCRAM-SHA-1".
     * @author: Philipp Hein #6356965
     */
    public String getURI() {
        // Exclude port if protocol includes +srv
        if (getPrefix().contains("+srv")) {
            return String.format(
                    "%s://%s:%s@%s/?authSource=%s&authMechanism=SCRAM-SHA-1&compressors=zstd",
                    getPrefix(), // Protocol
                    getUser(),   // Username
                    getPassword(), // Password
                    getHost(),   // Hostname
                    getDatabase() // Database name
            );
        }
        return String.format(
                "%s://%s:%s@%s:%s/?authSource=%s&authMechanism=SCRAM-SHA-1&compressors=zstd",
                getPrefix(), // Protocol
                getUser(),   // Username
                getPassword(), // Password
                getHost(),   // Hostname
                getPort(),   // Port
                getDatabase() // Database name
        );
    }

    /**
     * @return Protokoll als String.
     */
    public String getPrefix() {
        return System.getenv("REMOTE_PROTOCOL");
    }

    /**
     * @return Hostname als String.
     */
    public String getHost() {
        return System.getenv("REMOTE_HOST");
    }

    /**
     * @return der Name der Datenbank als String.
     */
    public String getDatabase() {
        return System.getenv("REMOTE_DATABASE");
    }

    /**
     * @return der Benutzername als String.
     */
    public String getUser() {
        return System.getenv("REMOTE_USER");
    }

    /**
     * @return Passwort als String.
     */
    public String getPassword() {
        return System.getenv("REMOTE_PASSWORD");
    }

    /**
     * @return Port als String.
     */
    public String getPort() {
        return System.getenv("REMOTE_PORT");
    }
}