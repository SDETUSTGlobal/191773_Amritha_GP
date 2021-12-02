describe('Login Page for Freelancer',()=> {
	it('Protractor Login', () => { 
			browser.get('https://www.freelancer.in/') 
                        .then(() => element(by.xpath('/html/body/app-root/app-logged-out-shell/app-navigation-logged-out/fl-bit/fl-container/fl-bit/fl-link[1]/a')).click())
			.then(() => element(by.xpath('/html/body/app-root/app-logged-out-shell/app-login-page/fl-container/fl-bit/app-login/app-credentials-form/form/fl-input[1]/fl-bit/fl-bit/input')).sendKeys('Amritha73')) 
			.then(() => element(by.xpath('/html/body/app-root/app-logged-out-shell/app-login-page/fl-container/fl-bit/app-login/app-credentials-form/form/fl-input[2]/fl-bit/fl-bit/input')).sendKeys('Amritha100#@')) 
                        .then(() => element(by.xpath('/html/body/app-root/app-logged-out-shell/app-login-page/fl-container/fl-bit/app-login/app-credentials-form/form/app-login-signup-button/fl-button/button')).click())
			//browser.getCurrentUrl().then((url) => {
				//expect(url).toBe('https://www.freelancer.in/new-freelancer/skills');})
		});
});
