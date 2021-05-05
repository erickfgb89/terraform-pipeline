class TerraformPluginVersion14 extends TerraformPluginVersion {
    @Override
    public void apply(TerraformInitCommand command) {
        command.withGlobalDirectoryOption()
    }

    @Override
    public void apply(TerraformValidateCommand command) {
        command.withGlobalDirectoryOption()
    }

    @Override
    public void apply(TerraformPlanCommand command) {
        command.withGlobalDirectoryOption()
    }

    @Override
    public void apply(TerraformApplyCommand command) {
        command.withGlobalDirectoryOption()
    }
}
