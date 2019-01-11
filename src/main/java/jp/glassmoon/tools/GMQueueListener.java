package jp.glassmoon.tool;

import java.util.Map;

/**
 * Listener interface for queue.
 *
 * @author rinrinne a.k.a. rin_ne
 */
public interface GMQueueListener {
    /**
     * Calls when message arrives.
     *
     * @param queueName
     *            the queue name.
     * @param headers
     *            the map of headers.
     * @param body
     *            the content body.
     */
    public void onReceive(String queueName, Map<String, Object> headers, byte[] body);

    /**
     * Calls when message arrives.
     *
     * @param queueName
     *            the queue name.
     * @param contentType
     *            the type of content.
     * @param headers
     *            the map of headers.
     * @param body
     *            the content body.
     */
    public void onReceive(String queueName, String contentType, Map<String, Object> headers, byte[] body);
}
