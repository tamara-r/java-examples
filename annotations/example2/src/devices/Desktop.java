package devices;

import annotations.OperationSystem;

@OperationSystem(systemName = "Windows", version = 11)
public class Desktop extends Computer{

    public Desktop(String name) {
        super(name);
    }

    @Deprecated
    public void deprecatedMethod() {
        return;
    }
}
