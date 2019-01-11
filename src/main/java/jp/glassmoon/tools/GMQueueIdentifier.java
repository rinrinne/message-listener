package jp.glassmoon.tool;

/**
 * Identifier interface for queue.
 *
 * @author rinrinne a.k.a. rin_ne
 */
public interface GMQueueIdentifier {
    /**
     * Gets name.
     *
     * @return the name.
     */
    public String getName();

    /**
     * Gets application id.
     *
     * @return the application id.
     */
    public String getAppId();
}
