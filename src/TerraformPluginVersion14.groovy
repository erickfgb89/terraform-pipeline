class TerraformPluginVersion14 extends TerraformPluginVersion12 {
    @Override
    public void apply(TerraformInitCommand command) {
        super.apply(command)
        command.withGlobalDirectoryOption()
    }

    @Override
    public void apply(TerraformValidateCommand command) {
        super.apply(command)
        command.withGlobalDirectoryOption()
    }

    @Override
    public void apply(TerraformPlanCommand command) {
        super.apply(command)
        command.withGlobalDirectoryOption()
    }

    @Override
    public void apply(TerraformApplyCommand command) {
        super.apply(command)
        command.withGlobalDirectoryOption()
    }
}
