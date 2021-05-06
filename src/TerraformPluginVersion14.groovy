class TerraformPluginVersion14 extends TerraformPluginVersion12 {
    @Override
    public void apply(TerraformInitCommand command) {
        sh 'global dir'
        command.withGlobalDirectoryOption()
        super.apply(command)
    }

    @Override
    public void apply(TerraformValidateCommand command) {
        command.withGlobalDirectoryOption()
        super.apply(command)
    }

    @Override
    public void apply(TerraformPlanCommand command) {
        command.withGlobalDirectoryOption()
        super.apply(command)
    }

    @Override
    public void apply(TerraformApplyCommand command) {
        command.withGlobalDirectoryOption()
        super.apply(command)
    }

    @Override
    public static TerraformInitCommand initCommandForValidate() {
        return TerraformInitCommand
            .instanceFor('validate')
            .withGlobalDirectoryOption()
            .withoutBackend()
    }
}
