package githubpages;

import actions.WebActions;
import lombok.experimental.Delegate;

public class BaseComponent {
    @Delegate
    private final WebActions webActions = new WebActions();
}
