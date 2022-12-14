package de.fhg.iais.roberta.syntax.action;

import de.fhg.iais.roberta.util.syntax.BlockType;
import de.fhg.iais.roberta.util.syntax.BlocklyBlockProperties;
import de.fhg.iais.roberta.util.syntax.BlocklyComment;
import de.fhg.iais.roberta.util.syntax.WithUserDefinedPort;

public abstract class MoveAction<V> extends Action<V> implements WithUserDefinedPort<V> {
    private final String port;

    public MoveAction(String port, BlockType kind, BlocklyBlockProperties properties, BlocklyComment comment) {
        super(kind, properties, comment);
        this.port = port;
    }

    /**
     * @return port on which the motor is connected.
     */
    public String getUserDefinedPort() {
        return this.port;
    }
}
