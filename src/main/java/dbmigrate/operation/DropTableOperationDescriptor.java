package dbmigrate.operation;

public class DropTableOperationDescriptor extends TableOperationDescriptor
		implements IOperationDescriptor {

	public DropTableOperationDescriptor() {
		super();
	}

	public DropTableOperationDescriptor(ITable table) {
		super(table);
	}

}